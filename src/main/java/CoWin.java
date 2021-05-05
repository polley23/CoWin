import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.mail.MessagingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CoWin {

    private final String url = "https://cdn-api.co-vin.in/api/";
    private List<String> pincodes = Arrays.asList("700156","700059","700135","700156","700160","743502","700098","700136",
    "700157","700161","700064","700097","700101","700105","700156","700091","700098","700102","700106","711101","711104");
    private ObjectMapper objectMapper = new ObjectMapper();
    private Map<String,List<Response>> pinCodeResp = new ConcurrentHashMap<>();

    void findVaccineCenterByPincodeForNext30Days(){
        String api = "/v2/appointment/sessions/public/calendarByPin";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        headers.set(HttpHeaders.ACCEPT_LANGUAGE, "hi_IN");
        Integer numberOfWeek = 12;
        Integer currentWeek = 0;

        HttpEntity<?> entity = new HttpEntity<>(headers);

        for (String pin : pincodes){
            List<Response> responseList = new ArrayList<>();
            while(numberOfWeek >0) {

                UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromHttpUrl(url.concat(api))
                        .queryParam("pincode", pin);
                uriComponentsBuilder
                        .queryParam("date", LocalDate.now()
                                .plusWeeks(currentWeek).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                try {
                    Response response = restTemplate.exchange(
                            uriComponentsBuilder.toUriString(),
                            HttpMethod.GET,
                            entity,
                            Response.class).getBody();
                    currentWeek++;
                    numberOfWeek--;
                    responseList.add(response);
                }catch (Exception e){
                    currentWeek++;
                    numberOfWeek--;
                    continue;

                }

            }
            pinCodeResp.put(pin,responseList);
            numberOfWeek=12;
            currentWeek=0;
        }
        MailBodyBuilder mailBodyBuilder = new MailBodyBuilder();

        MailSender mailSender = new MailSender();
        try {
            mailSender.send(mailBodyBuilder.build(pinCodeResp));
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        CoWin coWin = new CoWin();
        coWin.findVaccineCenterByPincodeForNext30Days();
    }
}
