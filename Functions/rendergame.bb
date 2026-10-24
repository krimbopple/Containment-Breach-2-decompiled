Function rendergame%()
    catcherrors("RenderGame()")
    T6ZBXBXD0F()
    rendertween = max(0.0, ((fps\Field7 / 1.147541) + 1.0))
    If (((0.0 < fps\Field3[$00]) And playerinreachableroom($00, $01, $01)) <> 0) Then
        rendersecuritycams()
    EndIf
    renderworldex(rendertween)
    renderblur(XZ0260X8X2\Field55)
    rendernvg()
    TX48FX24ZF4()
    If (X4BX024DX0() <> $00) Then
        T4XXBZ8Z06()
        TXDZ0F2ZFXZ($0A, $01)
        X26Z620XZX()
    EndIf
    rendergui()
    rendermessages()
    renderhintmessages()
    Y008002002()
    renderconsole()
    renderquickloading()
    renderachievementmsg()
    If (0.0 > XZ0260X8X2\Field2) Then
        If (XZ0260X8X2\Field40 <> $FFFFFFFF) Then
            renderending()
        EndIf
        rendersubtitles()
    ElseIf (XZ0260X8X2\Field40 = $FFFFFFFF) Then
        rendersubtitles()
        rendermenu()
    Else
        rendersubtitles()
    EndIf
    catcherrors("Uncaught: RenderGame()")
    Return $00
End Function
