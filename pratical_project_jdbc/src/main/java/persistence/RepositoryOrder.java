package persistence;

import util.DBUtil;

import java.sql.Connection;

public class RepositoryOrder {

    private Connection connection;

    public RepositoryOrder() { connection = DBUtil.getDBConnection(); }




}
