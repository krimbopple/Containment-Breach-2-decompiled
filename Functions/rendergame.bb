Function rendergame%()
    catcherrors("RenderGame()")
    GUESSEDshowentity()
    rendertween = max(0.0, ((fps\Field7 / 1.147541) + 1.0))
    If (((0.0 < fps\Field3[$00]) And playerinreachableroom($00, $01, $01)) <> 0) Then
        rendersecuritycams()
    EndIf
    renderworldex(rendertween)
    renderblur(XZ0260X8X2\Field55)
    rendernvg()
    GUESSEDsetcolor_2()
    If (GUESSEDupdatexdb() <> $00) Then
        GUESSEDrendercolor()
        GUESSEDrenderrendercursor($0A, $01)
        GUESSEDsetmpmsg()
    EndIf
    rendergui()
    rendermessages()
    renderhintmessages()
    GUESSEDinputbatching()
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
