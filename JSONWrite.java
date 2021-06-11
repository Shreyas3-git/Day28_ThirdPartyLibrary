import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
  
public class JSONWrite
{
    public static void main(String[] args) throws FileNotFoundException 
    {
    
        JSONObject jo = new JSONObject();
          
    
        jo.put("firstName", "Shreyas");
        jo.put("lastName", "Shinde");
        jo.put("age", 22);
          
    
        Map m = new LinkedHashMap(4);
        m.put("Address", "Shaniwar_Peth");
        m.put("city", "Satara");
        m.put("state", "Maharahstra");
        m.put("postalCode", 415002);
        m.put("Email_Addr","mr.shreyasshinde@gmail.com");  
    
        jo.put("address", m);
           
        JSONArray ja = new JSONArray();
          
        m = new LinkedHashMap(2);
        m.put("number", "77775960607");
          
        ja.add(m);
           
        jo.put("phoneNumbers", ja);
          
        PrintWriter pw = new PrintWriter("JSONExample.json");
        pw.write(jo.toJSONString());
          
        pw.flush();
        pw.close();
    }
}