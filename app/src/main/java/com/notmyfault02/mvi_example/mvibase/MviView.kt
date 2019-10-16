package com.notmyfault02.mvi_example.mvibase

import io.reactivex.Observable

interface MviView<I: MviIntent, S: MviViewState> {
    fun intents(): Observable<I>
    fun render(state: S)
}