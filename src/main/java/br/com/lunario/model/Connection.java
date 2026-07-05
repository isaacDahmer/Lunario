package br.com.lunario.model;

public class Connection {
    private String user;
    private String password;
    private String host;
    private String port;

    private Connection connection = null;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection(String user, String password, String host, String port, Connection connection) {
        this.user = user;
        this.password = password;
        this.host = host;
        this.port = port;
        this.connection = connection;
    }
}