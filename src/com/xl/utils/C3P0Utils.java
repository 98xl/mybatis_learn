package com.xl.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 肖亮
 * @date 2019/6/19 14:20
 */
public class C3P0Utils {
    private static ComboPooledDataSource comboPooledDataSource=new ComboPooledDataSource();


    public Connection getConnection() throws SQLException {
        return comboPooledDataSource.getConnection();
    }
    public void close(){
        comboPooledDataSource.close();
    }

    public static void main(String[] args) {
        C3P0Utils c3P0Utils=new C3P0Utils();
        try {
            Connection connection = c3P0Utils.getConnection();
            System.err.println("获取连接"+connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
