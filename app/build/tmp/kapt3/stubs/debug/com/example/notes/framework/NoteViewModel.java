package com.example.notes.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/example/notes/framework/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentNote", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/core/data/Note;", "getCurrentNote", "()Landroidx/lifecycle/MutableLiveData;", "saved", "", "getSaved", "useCases", "Lcom/example/notes/framework/UseCases;", "getUseCases", "()Lcom/example/notes/framework/UseCases;", "setUseCases", "(Lcom/example/notes/framework/UseCases;)V", "deleteNote", "", "note", "getNote", "id", "", "saveNote", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.notes.framework.UseCases useCases;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> saved = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.core.data.Note> currentNote = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.notes.framework.UseCases getUseCases() {
        return null;
    }
    
    public final void setUseCases(@org.jetbrains.annotations.NotNull()
    com.example.notes.framework.UseCases p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.core.data.Note> getCurrentNote() {
        return null;
    }
    
    public final void saveNote(@org.jetbrains.annotations.NotNull()
    com.example.core.data.Note note) {
    }
    
    public final void getNote(long id) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    com.example.core.data.Note note) {
    }
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}