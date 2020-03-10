package br.com.guilhermecunha.noteapp19.api

import br.com.guilhermecunha.noteapp19.model.Note
import br.com.guilhermecunha.noteapp19.model.NoteResponse
import retrofit2.Call
import retrofit2.http.*

interface NoteService {
    @GET("/nota")
    fun getNotes(): Call<NoteResponse>

    @GET("/nota/{id}")
    fun getNote(
        @Path("id") id: String
    ) : Call<Note>

    @POST("/nota")
    fun insertNote(
        @Body note: Note
    ) : Call<Note>
}