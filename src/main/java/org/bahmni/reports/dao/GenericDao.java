package org.bahmni.reports.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface GenericDao {
    ResultSet getResultSet(Connection connection,
                           String startDate, String endDate,
                           List<String> conceptNamesToFilter)
            throws SQLException;
}