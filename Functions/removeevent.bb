Function removeevent%(arg0.events)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field20 <> 0) Then
        If (arg0\Field2 <> $00) Then
            stopstream_strict(arg0\Field2)
            arg0\Field20 = $00
        EndIf
    Else
        StopChannel(arg0\Field2)
    EndIf
    arg0\Field2 = $00
    If (arg0\Field26 <> 0) Then
        If (arg0\Field8 <> $00) Then
            stopstream_strict(arg0\Field8)
            arg0\Field26 = $00
        EndIf
    Else
        StopChannel(arg0\Field8)
    EndIf
    arg0\Field8 = $00
    If (arg0\Field0 <> $00) Then
        freesound_strict(arg0\Field0)
        arg0\Field0 = $00
    EndIf
    If (arg0\Field30 <> $00) Then
        freesound_strict(arg0\Field30)
        arg0\Field30 = $00
    EndIf
    If (arg0\Field29 <> $00) Then
        freeimage(arg0\Field29)
        arg0\Field29 = $00
    EndIf
    If (arg0\Field16 <> $00) Then
        freeimage(arg0\Field16)
        arg0\Field16 = $00
    EndIf
    GUESSEDdeleteremoveevent(arg0)
    Delete arg0
    Return $00
End Function
