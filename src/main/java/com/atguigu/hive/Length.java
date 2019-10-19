package com.atguigu.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Length extends UDF {

    public int evaluate(String line) {
        int len = 0;
        if (line != null) {
            len = line.length();
        }
        return len;
    }

    public int evaluate(Number a) {
        int len = 0;
        if (a != null) {
            len = a.toString().length();
        }
        return len;
    }

    public int evaluate (boolean a) {
        return 0;
    }
}
