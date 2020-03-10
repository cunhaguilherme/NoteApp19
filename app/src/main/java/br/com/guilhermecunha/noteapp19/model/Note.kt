package br.com.guilhermecunha.noteapp19.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Note(
    @SerializedName("id") val id: String,
    @SerializedName("titulo") val title: String,
    @SerializedName("descricao") val description: String
):Parcelable
