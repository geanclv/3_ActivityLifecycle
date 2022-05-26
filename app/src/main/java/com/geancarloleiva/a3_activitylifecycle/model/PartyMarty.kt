package com.geancarloleiva.a3_activitylifecycle.model

import android.os.Parcel
import android.os.Parcelable

class PartyMarty constructor(var type: String, var detail: String) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(type)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PartyMarty> {
        override fun createFromParcel(parcel: Parcel): PartyMarty {
            return PartyMarty(parcel)
        }

        override fun newArray(size: Int): Array<PartyMarty?> {
            return arrayOfNulls(size)
        }
    }
}