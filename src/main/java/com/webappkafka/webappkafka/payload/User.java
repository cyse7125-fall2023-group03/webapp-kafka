package com.webappkafka.webappkafka.payload;

public class User {

	private String name;

	private String uri;

	private boolean is_paused;

	private int num_retries;

	private int uptime_sla;

	private int response_time_sla;

	private boolean use_ssl;

	private int response_status_code;

	private int check_interval_in_seconds;

	private String check_created;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public boolean isIs_paused() {
		return is_paused;
	}

	public void setIs_paused(boolean is_paused) {
		this.is_paused = is_paused;
	}

	public int getNum_retries() {
		return num_retries;
	}

	public void setNum_retries(int num_retries) {
		this.num_retries = num_retries;
	}

	public int getUptime_sla() {
		return uptime_sla;
	}

	public void setUptime_sla(int uptime_sla) {
		this.uptime_sla = uptime_sla;
	}

	public int getResponse_time_sla() {
		return response_time_sla;
	}

	public void setResponse_time_sla(int response_time_sla) {
		this.response_time_sla = response_time_sla;
	}

	public boolean isUse_ssl() {
		return use_ssl;
	}

	public void setUse_ssl(boolean use_ssl) {
		this.use_ssl = use_ssl;
	}

	public int getResponse_status_code() {
		return response_status_code;
	}

	public void setResponse_status_code(int response_status_code) {
		this.response_status_code = response_status_code;
	}

	public int getCheck_interval_in_seconds() {
		return check_interval_in_seconds;
	}

	public void setCheck_interval_in_seconds(int check_interval_in_seconds) {
		this.check_interval_in_seconds = check_interval_in_seconds;
	}

	public String getCheck_created() {
		return check_created;
	}

	public void setCheck_created(String check_created) {
		this.check_created = check_created;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", uri=" + uri + ", is_paused=" + is_paused + ", num_retries=" + num_retries
				+ ", uptime_sla=" + uptime_sla + ", response_time_sla=" + response_time_sla + ", use_ssl=" + use_ssl
				+ ", response_status_code=" + response_status_code + ", check_interval_in_seconds="
				+ check_interval_in_seconds + ", check_created=" + check_created + "]";
	}

}
