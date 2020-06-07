package com.example.notes.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u0014\u0010\u0019\u001a\u00020\u00122\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/example/notes/presentation/NotesListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/notes/presentation/NotesListAdapter$NoteViewHolder;", "notes", "Ljava/util/ArrayList;", "Lcom/example/core/data/Note;", "actions", "Lcom/example/notes/presentation/ListAction;", "(Ljava/util/ArrayList;Lcom/example/notes/presentation/ListAction;)V", "getActions", "()Lcom/example/notes/presentation/ListAction;", "getNotes", "()Ljava/util/ArrayList;", "setNotes", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateNotes", "newNotes", "", "NoteViewHolder", "app_debug"})
public final class NotesListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.notes.presentation.NotesListAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.core.data.Note> notes;
    @org.jetbrains.annotations.NotNull()
    private final com.example.notes.presentation.ListAction actions = null;
    
    public final void updateNotes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.core.data.Note> newNotes) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.notes.presentation.NotesListAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.notes.presentation.NotesListAdapter.NoteViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.core.data.Note> getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.core.data.Note> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.notes.presentation.ListAction getActions() {
        return null;
    }
    
    public NotesListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.core.data.Note> notes, @org.jetbrains.annotations.NotNull()
    com.example.notes.presentation.ListAction actions) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/notes/presentation/NotesListAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/notes/presentation/NotesListAdapter;Landroid/view/View;)V", "layout", "Landroidx/cardview/widget/CardView;", "kotlin.jvm.PlatformType", "noteContent", "Landroid/widget/TextView;", "noteDate", "noteTitle", "noteWords", "bind", "", "note", "Lcom/example/core/data/Note;", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.cardview.widget.CardView layout = null;
        private final android.widget.TextView noteTitle = null;
        private final android.widget.TextView noteContent = null;
        private final android.widget.TextView noteDate = null;
        private final android.widget.TextView noteWords = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.core.data.Note note) {
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}