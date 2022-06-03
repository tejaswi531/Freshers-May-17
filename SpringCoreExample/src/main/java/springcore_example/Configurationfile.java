package springcore_example;

import org.springframework.beans.factory.annotation.Value;

public class Configurationfile {
@Value("${url}")
private String url;
@Value("${driverclassname}")
private String driverclassname;
@Value("${username}")
private String username;
@Value("${password}")
private String password;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDriverclassname() {
	return driverclassname;
}
public void setDriverclassname(String driverclassname) {
	this.driverclassname = driverclassname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
