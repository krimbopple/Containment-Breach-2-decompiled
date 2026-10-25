Function removenpc%(arg0.npcs)
    If (arg0 = Null) Then
        Return $00
    EndIf
    catcherrors("RemoveNPC()")
    GUESSEDdeleteremovenpc(arg0)
    arg0\Field59 = Null
    If (arg0\Field94 <> 0) Then
        If (arg0\Field63 <> $00) Then
            stopstream_strict(arg0\Field63)
            arg0\Field94 = $00
        EndIf
    Else
        StopChannel(arg0\Field63)
    EndIf
    arg0\Field63 = $00
    If (arg0\Field88 <> 0) Then
        If (arg0\Field6 <> $00) Then
            stopstream_strict(arg0\Field6)
            arg0\Field88 = $00
        EndIf
    Else
        StopChannel(arg0\Field6)
    EndIf
    arg0\Field6 = $00
    If (arg0\Field55 <> $00) Then
        freesound_strict(arg0\Field55)
        arg0\Field55 = $00
    EndIf
    If (arg0\Field67 <> $00) Then
        freesound_strict(arg0\Field67)
        arg0\Field67 = $00
    EndIf
    entityparent(arg0\Field98, $00, $01)
    If (arg0\Field101 <> $00) Then
        freeentity(arg0\Field101)
        arg0\Field101 = $00
    EndIf
    If (arg0\Field99 <> $00) Then
        freeentity(arg0\Field99)
        arg0\Field99 = $00
    EndIf
    freeentity(arg0\Field82)
    arg0\Field82 = $00
    freeentity(arg0\Field98)
    arg0\Field98 = $00
    Delete arg0
    catcherrors("Uncaught: RemoveNPC()")
    Return $00
End Function
