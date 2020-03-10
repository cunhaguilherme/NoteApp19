package br.com.guilhermecunha.noteapp19.repository

import br.com.guilhermecunha.noteapp19.model.Note

interface NoteRepository {
    fun getNotes(
        onComplete:(List<Note>) -> Unit,
        onError:(Throwable) -> Unit
    )

    fun getNote(
        id: String,
        onComplete:(Note) -> Unit,
        onError:(Throwable) -> Unit
    )

    fun insertNote(
        title: String,
        description: String,
        onComplete:(Note) -> Unit,
        onError:(Throwable) -> Unit
    )


}