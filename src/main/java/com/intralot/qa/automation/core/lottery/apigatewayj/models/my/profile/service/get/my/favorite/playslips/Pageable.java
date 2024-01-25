package com.intralot.qa.automation.core.lottery.apigatewayj.models.my.profile.service.get.my.favorite.playslips;

import com.google.gson.annotations.SerializedName;

public class Pageable{

	@SerializedName("paged")
	private boolean paged;

	@SerializedName("pageNumber")
	private int pageNumber;

	@SerializedName("offset")
	private int offset;

	@SerializedName("pageSize")
	private int pageSize;

	@SerializedName("unpaged")
	private boolean unpaged;

	@SerializedName("sort")
	private Sort sort;

	public void setPaged(boolean paged){
		this.paged = paged;
	}

	public boolean isPaged(){
		return paged;
	}

	public void setPageNumber(int pageNumber){
		this.pageNumber = pageNumber;
	}

	public int getPageNumber(){
		return pageNumber;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}

	public int getPageSize(){
		return pageSize;
	}

	public void setUnpaged(boolean unpaged){
		this.unpaged = unpaged;
	}

	public boolean isUnpaged(){
		return unpaged;
	}

	public void setSort(Sort sort){
		this.sort = sort;
	}

	public Sort getSort(){
		return sort;
	}
}