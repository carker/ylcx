package com.carker.Utils;

import android.util.Log;

import com.carker.bean.Book;
import com.carker.bean.BookClassify;
import com.carker.bean.BookList;
import com.carker.bean.City;
import com.carker.bean.DurgClassify;
import com.carker.bean.DurgInformation;
import com.carker.bean.DurgList;
import com.carker.bean.DurgNumber;
import com.carker.bean.DurgSearch;
import com.carker.bean.HospitalFeature;
import com.carker.bean.HospitalInformation;
import com.carker.bean.HospitalList;
import com.carker.bean.HospitalLocation;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

/**
 * Created by PC on 2015/9/28.
 */
public class ApiHttpClient {
    //APISTORE
    //http://apistore.baidu.com/apiworks/servicedetail/979.html
    private static final String URL_BOOK = "http://apis.baidu.com/tngou/book/show";
    private static final String URL_BOOK_CLASSIFY = "http://apis.baidu.com/tngou/book/classify";
    private static final String URL_BOOK_LIST = "http://apis.baidu.com/tngou/book/list";
    //http://apistore.baidu.com/apiworks/servicedetail/988.html
    private static final String URL_CITY = "http://apis.baidu.com/tngou/hospital/city";
    private static final String URL_HOSPITAL_LIST = "http://apis.baidu.com/tngou/hospital/list";
    private static final String URL_HOSPITAL_LOCATION = "http://apis.baidu.com/tngou/hospital/location";
    private static final String URL_HOSPITAL_INFORMATION = "http://apis.baidu.com/tngou/hospital/show";
    private static final String URL_HOSPITAL_NAME = "http://apis.baidu.com/tngou/hospital/name";
    private static final String URL_HOSPITAL_FEATURE = "http://apis.baidu.com/tngou/hospital/feature";
    //durg
    private static final String URL_DURG_CLASSIFY= "http://apis.baidu.com/tngou/drug/classify";
    private static final String URL_DURG_LIST= "http://apis.baidu.com/tngou/drug/list";
    private static final String URL_DURG_INFORMATION= "http://apis.baidu.com/tngou/drug/show";
    private static final String URL_DURG_NUMBER= "http://apis.baidu.com/tngou/drug/number";
    private static final String URL_DURG_CODE= "http://apis.baidu.com/tngou/drug/code";
    private static final String URL_DURG_SEARCH= "http://apis.baidu.com/tngou/drug/search";



    private ApiHttpClient() {
    }

    private static AsyncHttpClient client;
    private static Gson gson;

    static {
        client = new AsyncHttpClient();
        client.addHeader("apikey", "6328fd3bb018a3c18eae6540fbc65106");
        gson = new Gson();
    }

    /**
     * 获取图书具体内容
     */
    public static void getBook(int id) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                Book book = gson.fromJson(new String(responseBody), Book.class);
                Log.i("tag", book.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("id", "" + id);

        client.get(URL_BOOK, rp, hanlder);
    }

    /**
     * 获取图书分类
     * error 原因：responseBody过长
     */
    public static void getBookClassify() {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                BookClassify[] book = gson.fromJson(new String(responseBody), BookClassify[].class);
                Log.i("tag", book.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        client.get(URL_BOOK_CLASSIFY, hanlder);
    }

    /**
     * @param id   图书分类ID
     * @param page 页数
     * @param rows 条数
     */
    public static void getBookList(String id, int page, int rows) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                BookList book = gson.fromJson(new String(responseBody), BookList.class);
                Log.i("tag", book.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        RequestParams rp = new RequestParams();
        rp.put("id", id);
        rp.put("page", "" + page);
        rp.put("rows", "" + rows);
        client.get(URL_BOOK_LIST, rp, hanlder);
    }

    public static void getCity() {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));

                City[] city = gson.fromJson(new String(responseBody), City[].class);
                Log.i("tag", city.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        RequestParams rp = new RequestParams();
        rp.put("type", "all");
        client.get(URL_CITY, rp, hanlder);
    }

    /**
     * @param id   城市/省份 ID
     * @param page 页数
     * @param rows 条数
     */
    public static void getHsopitalList(String id, int page, int rows) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag-test-test", new String(responseBody));
                Gson gson = new Gson();
                HospitalList list = gson.fromJson(new String(responseBody), HospitalList.class);
                Log.i("tag-test-test", list.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        RequestParams rp = new RequestParams();
        rp.put("id", id);
        rp.put("page", "" + page);
        rp.put("rows", "" + rows);
        client.get(URL_HOSPITAL_LIST, rp, hanlder);
    }

    /**
     * @param x    地图x坐标（高德地图）
     * @param y    地图y坐标（高德地图）
     * @param page 页数
     * @param rows 条数
     */
    public static void getHsopitalLocation(double x, double y, int page, int rows) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                HospitalLocation location = gson.fromJson(new String(responseBody), HospitalLocation.class);
                Log.i("tag", location.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        RequestParams rp = new RequestParams();
        rp.put("x", "" + x);
        rp.put("y", "" + y);
        rp.put("page", "" + page);
        rp.put("rows", "" + rows);
        client.get(URL_HOSPITAL_LOCATION, rp, hanlder);
    }

    public static void getHsopitalInformation(int id) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                HospitalInformation information = gson.fromJson(new String(responseBody), HospitalInformation.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };

        RequestParams rp = new RequestParams();
        rp.put("id", "" + id);
        client.get(URL_HOSPITAL_INFORMATION, rp, hanlder);
    }

    public static void getHsopitalInformation(String hospitalName) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                HospitalInformation information = gson.fromJson(new String(responseBody), HospitalInformation.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("name", hospitalName);
        client.get(URL_HOSPITAL_NAME, rp, hanlder);
    }

    public static void getHsopitalFeature(int id) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                HospitalFeature[] information = gson.fromJson(new String(responseBody), HospitalFeature
                        [].class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("id", ""+id);
        client.get(URL_HOSPITAL_FEATURE, rp, hanlder);
    }
    public static void getDurgClassify(int number) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgClassify[] information = gson.fromJson(new String(responseBody), DurgClassify
                        [].class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("number", ""+number);
        client.get(URL_DURG_CLASSIFY, rp, hanlder);
    }

    public static void getDurgList(int id, int page, int rows) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgList[] information = gson.fromJson(new String(responseBody), DurgList[].class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("id", ""+id);
        rp.put("rows", ""+rows);
        rp.put("page", ""+page);
        client.get(URL_DURG_CLASSIFY, rp, hanlder);
    }

    public static void getDurgInformation(int id) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgInformation information = gson.fromJson(new String(responseBody), DurgInformation.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("id", ""+id);

        client.get(URL_DURG_INFORMATION, rp, hanlder);
    }

    /**
     *
     * @param number 国药准字（【Z20064339】)
     */
    public static void getDurgName(String number) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgNumber information = gson.fromJson(new String(responseBody), DurgNumber.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("number", number);

        client.get(URL_DURG_NUMBER, rp, hanlder);
    }

    /**
     *
     * @param code 条形码【13位】
     */
    public static void getDurgCode(String code) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgNumber information = gson.fromJson(new String(responseBody), DurgNumber.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("code", code);

        client.get(URL_DURG_CODE, rp, hanlder);
    }

    /**
     *
     * @param name          搜索板块 name=drug
     * @param keyword       搜索关键词
     * @param page          页数
     * @param rows          条数
     * @param type          索引字段,如name,message多个
     */
    public static void getDurgSearch(String name, String keyword, int page, int rows, String type) {
        AsyncHttpResponseHandler hanlder = new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                Log.i("tag", new String(responseBody));
                Gson gson = new Gson();
                DurgSearch information = gson.fromJson(new String(responseBody), DurgSearch.class);
                Log.i("tag", information.toString());
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                Log.i("tag", statusCode + "");
            }
        };
        RequestParams rp = new RequestParams();
        rp.put("name", name);
        rp.put("keyword", keyword);
        rp.put("page", page);
        rp.put("rows", rows);
        rp.put("type", type);

        client.get(URL_DURG_SEARCH, rp, hanlder);
    }

}

