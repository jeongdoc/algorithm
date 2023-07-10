import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;

public class Test2 {
    public static void main(String[] args) {

        Gson gson = new Gson();

        JsonArray ja = makeData();
        System.out.println(ja);
    }


    // 중첩 for-loop data 생성
    private static JsonArray makeData() {

        JsonArray ja = new JsonArray();
        for(int i = 0; i < 200; i++) {
            JsonObject jobj = new JsonObject();

            jobj.addProperty(String.valueOf(i), String.valueOf(i));
            JsonArray ja2 = new JsonArray();
            for(int j = 0; j < 6; j++) {
            
                JsonObject innerObj = new JsonObject();
                innerObj.addProperty("2nd"+String.valueOf(j), String.valueOf(j));

                JsonArray ja3 = new JsonArray();
                for(int p = 0; p < 8; p++) {
                    
                    JsonObject innerObj2 = new JsonObject();
                    innerObj2.addProperty("3nd"+String.valueOf(p), String.valueOf(p));
                    
                    ja3.add(innerObj2);
                    innerObj.add("arr3", ja3);

                    JsonArray ja4 = new JsonArray();
                    for(int q = 0; q < 12; q++) {

                        JsonObject innerObj3 = new JsonObject();
                        innerObj3.addProperty("4nd"+String.valueOf(p), String.valueOf(p));
                        
                        ja4.add(innerObj3);
                        innerObj.add("arr4", ja4);

                    }
                }
                ja2.add(innerObj);
                jobj.add("arr2", ja2);
            }
            ja.add(jobj);
        }

        return ja;

    }
} 
