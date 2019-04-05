package com.capgemini.spring.model;

import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.Resource;
import com.capgemini.spring.model.*;


@Component("organization")
public class Organization {
	@Value("10021001")
	private int orgId;

	@Value("Capgemini")
	private String orgName;

	@Value("6021010")
	private double marketPrice;

	@Autowired
	@Qualifier("address")
	private Address address;
	
	@Resource(name="list")
	private List<String> directors;

	@Resource(name="set")
	private Set<String> branches;

	@Resource(name="map")
	private Map<String,String> branchWiseHead;

	@Resource(name="ipAddress")
	private Properties ipAddress;

	@Resource(name="database")
	private Properties databaseDetails;
	
	public Organization() {
		super();
		
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public Set<String> getBranches() {
		return branches;
	}

	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}

	public Map<String, String> getBranchWiseHead() {
		return branchWiseHead;
	}

	public void setBranchWiseHead(Map<String, String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}

	public Properties getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(Properties ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Properties getDatabaseDetails() {
		return databaseDetails;
	}

	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}
	

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", directors="
				+ directors + ", branches=" + branches + ", branchWiseHead=" + branchWiseHead + ", ipAddress="
				+ ipAddress + ", databaseDetails=" + databaseDetails + "]";
	}


}
