/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.hardware.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * A class describing messages send to or from nanoapps through the Context Hub Service.
 *
 * The basis of the class is in the IContextHub.hal ContextHubMsg definition.
 *
 * @hide
 */

public final class NanoAppMessage implements Parcelable {


    private NanoAppMessage(
            long nanoAppId, int messageType, byte[] messageBody, boolean broadcasted) {
        throw new RuntimeException("Stub!");
    }

    /**
     * Creates a NanoAppMessage object to send to a nanoapp.
     *
     * This factory method can be used to generate a NanoAppMessage object to be used in
     * the ContextHubClient.sendMessageToNanoApp API.
     *
     * @param targetNanoAppId the ID of the nanoapp to send the message to
     * @param messageType the nanoapp-dependent message type
     * @param messageBody the byte array message contents
     *
     * @return the NanoAppMessage object
     */
    public static NanoAppMessage createMessageToNanoApp(
            long targetNanoAppId, int messageType, byte[] messageBody) {
        throw new RuntimeException("Stub!");
    }

    /**
     * Creates a NanoAppMessage object sent from a nanoapp.
     *
     * This factory method is intended only to be used by the Context Hub Service when delivering
     * messages from a nanoapp to clients.
     *
     * @param sourceNanoAppId the ID of the nanoapp that the message was sent from
     * @param messageType the nanoapp-dependent message type
     * @param messageBody the byte array message contents
     * @param broadcasted {@code true} if the message was broadcasted, {@code false} otherwise
     *
     * @return the NanoAppMessage object
     */
    public static NanoAppMessage createMessageFromNanoApp(
            long sourceNanoAppId, int messageType, byte[] messageBody, boolean broadcasted) {
        throw new RuntimeException("Stub!");
    }

    /**
     * @return the ID of the source or destination nanoapp
     */
    public long getNanoAppId() {
        throw new RuntimeException("Stub!");
    }

    /**
     * @return the type of the message that is nanoapp-dependent
     */
    public int getMessageType() {
        throw new RuntimeException("Stub!");
    }

    /**
     * @return the byte array contents of the message
     */
    public byte[] getMessageBody() {
        throw new RuntimeException("Stub!");
    }

    /**
     * @return {@code true} if the message is broadcasted, {@code false} otherwise
     */
    public boolean isBroadcastMessage() {
        throw new RuntimeException("Stub!");
    }

    private NanoAppMessage(Parcel in) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        throw new RuntimeException("Stub!");
    }

    public static final @NonNull Creator<NanoAppMessage> CREATOR =
            new Creator<NanoAppMessage>() {
                @Override
                public NanoAppMessage createFromParcel(Parcel in) {
                    return new NanoAppMessage(in);
                }

                @Override
                public NanoAppMessage[] newArray(int size) {
                    return new NanoAppMessage[size];
                }
            };

    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }

    @Override
    public boolean equals(@Nullable Object object) {
        throw new RuntimeException("Stub!");
    }
}