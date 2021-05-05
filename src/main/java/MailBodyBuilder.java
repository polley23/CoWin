import java.util.*;
import java.util.stream.Collectors;

public class MailBodyBuilder {


    public String build(Map<String, List<Response>> pinCodeResps){
        Map<String,SessionPerPincode> sessionPerPincodeMap = new HashMap<>();
        for (Map.Entry<String, List<Response>> pinCodeResp : pinCodeResps.entrySet()){
            SessionPerPincode sessionPerPincode = new SessionPerPincode();
            Set<String> dates = new HashSet<>();
            Set<Integer> ages = new HashSet<>();

            Integer sessionAvailable = 0;
            for(Response response : pinCodeResp.getValue()){
                for(Center center : response.getCenters()){
                    if(center.getSessions()!=null){
                        sessionAvailable = sessionAvailable + center.getSessions().stream().map(session -> session.getAvailableCapacity())
                        .reduce(0, Integer::sum);
                        for(Session session : center.getSessions()){
                            if(session.getAvailableCapacity()>0) {
                                dates.add(session.getDate());
                                ages.add(session.getMinAgeLimit());
                            }
                        }
                    }
                }
            }
            if (sessionAvailable > 0) {
                sessionPerPincode.setAvailableY_N("YES");
            } else {
                sessionPerPincode.setAvailableY_N("NO");
            }
            String datelist = "";
            List<String> datesList =  dates.stream().collect(Collectors.toList());
            Collections.sort(datesList);
            for(String date : datesList){
                datelist = datelist.concat(String.valueOf(date)).concat(" ");
            }
            sessionPerPincode.setDates(datelist);
            String agelist = "";
            for(Integer age : ages){
                agelist = agelist.concat(String.valueOf(age)).concat(" ");
            }
            sessionPerPincode.setAgeLimit(agelist);
            sessionPerPincodeMap.put(pinCodeResp.getKey(),sessionPerPincode);
            sessionPerPincode.setPincode(pinCodeResp.getKey());
        }
        return buildHtml(sessionPerPincodeMap);

    }

    private String buildHtml(Map<String,SessionPerPincode> sessionPerPincodeMap){
        String out = "<html>";
        out =out.concat("<head>\n");
        out =out.concat("</head>\n");
        out =out.concat("<body>\n");
        out =out.concat("<table border=\"1\">\n");
        out = out.concat("<tr>\n");
        out = out.concat("<th>");
        out = out.concat("Pincode");
        out = out.concat("</th>\n");
        out = out.concat("<th>");
        out = out.concat("Available");
        out = out.concat("</th>\n");
        out = out.concat("<th>");
        out = out.concat("Agelimit");
        out = out.concat("</th>\n");
        out = out.concat("<th>");
        out = out.concat("Dates");
        out = out.concat("</th>\n");
        out = out.concat("</tr>\n");

        for(SessionPerPincode sessionPerPincode : sessionPerPincodeMap.values()){
            out = out.concat("<tr>\n");
            out =out.concat("<td>").concat(sessionPerPincode.getPincode()).concat("</td>");
            out =out.concat("<td>").concat(sessionPerPincode.getAvailableY_N()).concat("</td>");
            out =out.concat("<td>").concat(sessionPerPincode.getAgeLimit()).concat("</td>");
            out =out.concat("<td>").concat(sessionPerPincode.getDates()).concat("</td>");
            out =out.concat("</tr>\n");
        }
        out =out.concat("</table>\n");
        out =out.concat("</body>\n");
        out = out.concat("</html>");

        return out;
    }
}
