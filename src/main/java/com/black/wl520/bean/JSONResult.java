package com.black.wl520.bean;

public class JSONResult {

    private String error_code;
    private String error_message;
    private Object datas;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

//    public JSONObject build() {
//        JSONObject object = new JSONObject();
//        object.put("error_code", error_code);
//        object.put("error_message", error_message);
//        object.put("datas", datas);
//        return object;
//    }
}
