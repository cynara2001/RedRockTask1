package com.example.threaddemo.JSON;

import android.app.DownloadManager;
import android.widget.EditText;

import com.example.threaddemo.buider.ThatYearBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonToJavaList {

EditText tvRes = null;
    //将json格式的字符串[]转化为Java对象的List
    public void JsonToJavaListByNative() {
        //获取或创建Json数组
        String json = "[\n" +
                "        {\n" +
                "            \"year\": 1804,\n" +
                "            \"monthday\": \"0314\",\n" +
                "            \"title\": \"奥地利作曲家老约翰·施特劳斯出生\",\n" +
                "            \"desc\": \"约翰·施特劳斯（德语：Johann Strauss，1825-1899），奥地利著名的作曲家、指挥家、小提琴家。他自幼酷爱音乐，7岁便开始创作圆\",\n" +
                "            \"type\": \"birth\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"year\": 1879,\n" +
                "            \"monthday\": \"0314\",\n" +
                "            \"title\": \"物理学家爱因斯坦出生\",\n" +
                "            \"desc\": \"阿尔伯特·爱因斯坦（1879.3.14——1955.4.18）犹太裔物理学家。他于1879年出生于德国乌尔姆市的一个犹太人家庭（父母均为犹太人\",\n" +
                "            \"type\": \"birth\"\n" +
                "        }]";

        List<ThatYearBean> thatYears = new ArrayList<>();
        //解析Json数据
        try {
            JSONArray jsonArray = new JSONArray(json);

            for (int i = 0; i < jsonArray.length(); i++) {
                //以下拿到一个一个的对象
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                if (jsonObject != null) {
                    int id = jsonObject.optInt("id");
                    int id1 = jsonObject.getInt("id");
                    String year = jsonObject.optString("year");
                    String monthDay = jsonObject.optString("monthDay");
                    String title = jsonObject.optString("title");
                    String desc = jsonObject.optString("desc");
                    String type = jsonObject.optString("type");

                    //封装Java对象
                    //ThatYearBean thatYearBean = new ThatYearBean(id,year,monthDay,title,desc,type);
                    //将每一个对象都存到了thatYears集合里
                    //thatYears.add(thatYearBean);
                }
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        //显示Json数据
        tvRes.setText(json);
        //tv.setText(thatYears.toString());
    }
}
