/*
 * Copyright 2020- Network Revolution Inc.
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
 *
 */

package com.dokoden.nr_tel.utility

object Constants {
    const val DefaultNotifyID = 1
    const val CallNotifyID = 2

    enum class RequestCode {
        Permission,
        Default,
        Call,
    }

    enum class Actions {
        TelephoneNew,
        TelephoneDialing,
        TelephoneRinging,
        TelephoneHolding,
        TelephoneActive,
        TelephoneDisconnected,
        TelephoneSelectPhoneAccount,
        TelephoneConnecting,
        TelephoneDisconnecting,
        TelephonePullingCall,
        TelephoneAudioProcessing,
        TelephoneSimulatedRinging,

        Start,
        ReStart,
        Action,
        Accounts,
        RegState,
        BuddyState,
        BuddyEvSubState,
        Call,
        IncomingCallScreen,
        IncomingCallState,
        OutgoingCall,
        OutgoingCallRinging,
        CallMediaState,
        CallTsxState,
        CallMediaTransportState,
        CallShow,
        AcceptIncomingCall,
        DeclineIncomingCall,
        HangupCall,
        TransferCall,
        DeclineTransferCall,
        TransferShow,
        TransferAccept,
        TransferDeny,
        Message,
        MessageShow,
        MessageReply,
        MessageSave,
        MessageDelete,
        TransportState,
        JbufState,
        EvSubscriptionState,
        UpdateNotification,
        ChangeNetwork,
        SetSpeaker,
        Stop,
        StopForce,
        Kill,
    }
}

