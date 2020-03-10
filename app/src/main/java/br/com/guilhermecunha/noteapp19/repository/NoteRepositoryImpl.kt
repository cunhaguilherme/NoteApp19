package br.com.guilhermecunha.noteapp19.repository

import br.com.guilhermecunha.noteapp19.api.NoteService
import br.com.guilhermecunha.noteapp19.model.Note
import br.com.guilhermecunha.noteapp19.model.NoteResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NoteRepositoryImpl(var noteService: NoteService) : NoteRepository{
    override fun getNotes(onComplete: (List<Note>) -> Unit, onError: (Throwable) -> Unit) {
        noteService.getNotes().enqueue(object : Callback<NoteResponse>{

            override fun onFailure(call: Call<NoteResponse>, t: Throwable) {
                onError(t)
            }

            override fun onResponse(call: Call<NoteResponse>, response: Response<NoteResponse>) {
                if(response.isSuccessful) {
                    onComplete(response.body()?.content ?: listOf())
                } else {
                    onError(Throwable("Não foi possível carregar as notas."))
                }
            }

        })
    }

    override fun getNote(id: String, onComplete: (Note) -> Unit, onError: (Throwable) -> Unit) {
        noteService.getNote(id).enqueue(object: Callback<Note>{
            override fun onFailure(call: Call<Note>, t: Throwable) {
                onError(t)
            }

            override fun onResponse(call: Call<Note>, response: Response<Note>) {

            }

        })
    }

    override fun insertNote(
        title: String,
        description: String,
        onComplete: (Note) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}