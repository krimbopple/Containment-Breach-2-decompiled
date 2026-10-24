Function playmovie%(arg0$)
    Local local0%
    Local local1#
    Local local2#
    Local local3%
    Local local4$
    Local local5$
    Local local6%
    Local local7%
    Local local8%
    If (runningonwine() <> 0) Then
        Return $00
    EndIf
    If (opt\Field11 = $00) Then
        Return $00
    EndIf
    hidepointer()
    local1 = (1.0 / 0.5625)
    local2 = (graphicwidthfloat / graphicheightfloat)
    If (local1 < local2) Then
        local0 = opt\Field46
    Else
        local0 = (Int ((Float opt\Field21) / local1))
    EndIf
    local5 = ("GFX\Menu\" + arg0)
    local6 = openmovie_strict((local5 + ".webm"))
    local7 = streamsound_strict((local5 + ".ogg"), (opt\Field13 * opt\Field2), $00)
    Repeat
        cls()
        drawmovie(local6, $00, (TDD0Z6BXB6\Field9 - (local0 Sar $01)), opt\Field21, local0)
        If (initializeintromovie <> 0) Then
            local4 = getlocalstring("menu", "wakeup")
        Else
            local4 = getlocalstring("menu", "anykey")
        EndIf
        renderloadingtext(TDD0Z6BXB6\Field6, (Int ((Float opt\Field46) - (35.0 * menuscale))), local4, $01, $01)
        flip($00)
        delay($0A)
        local8 = $00
        If ((((getkey() <> $00) Lor mousehit($01)) Lor (isstreamplaying_strict(local7) = $00)) <> 0) Then
            resetloadingtextcolor()
            stopstream_strict(local7)
            local7 = $00
            closemovie(local6)
            local6 = $00
            local8 = $01
        EndIf
    Until (local8 <> 0)
    cls()
    flip(opt\Field16)
    showpointer()
    Return $00
End Function
