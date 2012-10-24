/*
 * Copyright 2012 Sony Computer Science Laboratories, Inc. <info@kadecot.net>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sonycsl.echo.eoj.device.housingfacilities.proxy;

import com.sonycsl.echo.eoj.device.housingfacilities.ElectricStormWindow;

public class ElectricStormWindowProxy extends ElectricStormWindow {
	@SuppressWarnings("unused")
	private static final String TAG = ElectricStormWindowProxy.class.getSimpleName();

	private byte mInstanceCode;
	
	public ElectricStormWindowProxy(byte instanceCode) {
		mInstanceCode = instanceCode;
	}
	
	@Override
	public byte getInstanceCode() {
		return mInstanceCode;
	}
	
	@Override
	public boolean isProxy() {
		return true;
	}
	
	@Override
	protected byte[] getOperationStatus() {return null;}
	@Override
	protected boolean setInstallationLocation(byte[] arg) {return false;}
	@Override
	protected byte[] getInstallationLocation() {return null;}
	@Override
	protected byte[] getStandardVersionInformation() {return null;}
	@Override
	protected byte[] getFaultStatus() {return null;}
	@Override
	protected byte[] getManufacturerCode() {return null;}
	@Override
	protected byte[] getStatusChangeAnnouncementPropertyMap() {return null;}
	@Override
	protected byte[] getSetPropertyMap() {return null;}
	@Override
	protected byte[] getGetPropertyMap() {return null;}
	
	@Override
	protected boolean setOpenCloseSetting1(byte[] edt) {return false;}
	@Override
	protected byte[] getOpenCloseSetting1() {return null;}
	@Override
	protected boolean setElectricLockSetting(byte[] edt) {return false;}
	@Override
	protected byte[] getElectricLockSetting() {return null;}

	@Override
	public Informer inform() {
		return new InformerProxy();
	}
	
	public static class Receiver extends ElectricStormWindow.Receiver {
	}
}
