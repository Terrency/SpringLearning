package com.springbootlearning.project.model;


/**
 * 用户信息表
 * 
 * @author zhangJT
 * @date 2017-10-12 11:22:08
 */
public class UserModel {
	//
	private Integer id;
	//用户姓名
	private String userName;
	//密码
	private String password;
	//身份证
	private String idNumber;
	//联系方式
	private String phone;
	//地址_市
	private String addressCity;
	//地址_区
	private String addressArea;
	//详细地址
	private String addressInfo;
	//是否是户主
	private Boolean isClients;
	//角色
	private Integer roleId;
	//
	private String createTime;
	//
	private String modifyTime;
	//
	private Integer deleteFlag = 0;
	//
	private String wechatOpenid;
	//
	private String wechatName;
	//
	private String wechatImage;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：身份证
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * 获取：身份证
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * 设置：联系方式
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：联系方式
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：地址_市
	 */
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	/**
	 * 获取：地址_市
	 */
	public String getAddressCity() {
		return addressCity;
	}
	/**
	 * 设置：地址_区
	 */
	public void setAddressArea(String addressArea) {
		this.addressArea = addressArea;
	}
	/**
	 * 获取：地址_区
	 */
	public String getAddressArea() {
		return addressArea;
	}
	/**
	 * 设置：详细地址
	 */
	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}
	/**
	 * 获取：详细地址
	 */
	public String getAddressInfo() {
		return addressInfo;
	}
	/**
	 * 设置：是否是户主
	 */
	public void setIsClients(Boolean isClients) {
		this.isClients = isClients;
	}
	/**
	 * 获取：是否是户主
	 */
	public Boolean getIsClients() {
		return isClients;
	}
	/**
	 * 设置：角色
	 */
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * 获取：角色
	 */
	public Integer getRoleId() {
		return roleId;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public String getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setModifyTime(String modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：
	 */
	public String getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：
	 */
	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	/**
	 * 获取：
	 */
	public Integer getDeleteFlag() {
		return deleteFlag;
	}
	/**
	 * 设置：
	 */
	public void setWechatOpenid(String wechatOpenid) {
		this.wechatOpenid = wechatOpenid;
	}
	/**
	 * 获取：
	 */
	public String getWechatOpenid() {
		return wechatOpenid;
	}
	/**
	 * 设置：
	 */
	public void setWechatName(String wechatName) {
		this.wechatName = wechatName;
	}
	/**
	 * 获取：
	 */
	public String getWechatName() {
		return wechatName;
	}
	/**
	 * 设置：
	 */
	public void setWechatImage(String wechatImage) {
		this.wechatImage = wechatImage;
	}
	/**
	 * 获取：
	 */
	public String getWechatImage() {
		return wechatImage;
	}
}
