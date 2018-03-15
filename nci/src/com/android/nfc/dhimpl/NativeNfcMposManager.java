/******************************************************************************
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  Copyright 2018 NXP
 *
 ******************************************************************************/

package com.android.nfc.dhimpl;

public class NativeNfcMposManager {
    private static final String TAG = "NativeNfcMposManager";

    public native void doSetEtsiReaederState(int newState);

    public native int doGetEtsiReaederState();

    public native void doEtsiReaderConfig(int eeHandle);

    public native void doNotifyEEReaderEvent(int evt);

    public native void doEtsiInitConfig();

    public native void doEtsiResetReaderConfig();

    public native void doStopPoll(int mode);

    public native void doStartPoll();

    public native int doMposSetReaderMode(boolean on);
}