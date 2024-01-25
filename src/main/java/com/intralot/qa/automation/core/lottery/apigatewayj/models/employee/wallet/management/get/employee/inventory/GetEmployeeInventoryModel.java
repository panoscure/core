
package com.intralot.qa.automation.core.lottery.apigatewayj.models.employee.wallet.management.get.employee.inventory;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetEmployeeInventoryModel {

    @SerializedName("employeePockets")
    @Expose
    private List<EmployeePocket> employeePockets = null;
    @SerializedName("retailerPockets")
    @Expose
    private List<RetailerPocket> retailerPockets = null;

    public List<EmployeePocket> getEmployeePockets() {
        return employeePockets;
    }

    public void setEmployeePockets(List<EmployeePocket> employeePockets) {
        this.employeePockets = employeePockets;
    }

    public List<RetailerPocket> getRetailerPockets() {
        return retailerPockets;
    }

    public void setRetailerPockets(List<RetailerPocket> retailerPockets) {
        this.retailerPockets = retailerPockets;
    }

}
