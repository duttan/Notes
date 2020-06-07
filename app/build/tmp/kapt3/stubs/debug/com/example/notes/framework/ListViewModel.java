package com.example.notes.framework;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/example/notes/framework/ListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "notes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/core/data/Note;", "getNotes", "()Landroidx/lifecycle/MutableLiveData;", "useCases", "Lcom/example/notes/framework/UseCases;", "getUseCases", "()Lcom/example/notes/framework/UseCases;", "setUseCases", "(Lcom/example/notes/framework/UseCases;)V", "", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.notes.framework.UseCases useCases;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.core.data.Note>> notes = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.notes.framework.UseCases getUseCases() {
        return null;
    }
    
    public final void setUseCases(@org.jetbrains.annotations.NotNull()
    com.example.notes.framework.UseCases p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.core.data.Note>> getNotes() {
        return null;
    }
    
    public final void getNotes() {
    }
    
    public ListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}