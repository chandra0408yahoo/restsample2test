package util;

import com.google.common.collect.ImmutableList;

import java.util.HashMap;
import java.util.Map;

public class DataGenerator {


    public Map<String, Object> dataforuser() {
        Map<String, Object> params = new HashMap<String, Object>();

        params.put("name", "morpheus");
        params.put("job","leader");

        return params;
    }


}
