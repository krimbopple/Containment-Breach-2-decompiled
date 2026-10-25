Function GUESSEDdeleteentity_3%(arg0.TX2BXBZF2B6)
    If (arg0 = Null) Then
        Return $00
    EndIf
    freeentity(arg0\Field1)
    If (arg0\Field4 <> $00) Then
        freeentity(arg0\Field4)
    EndIf
    GUESSEDdeleteerase($04, arg0\Field5, arg0, $FFFFFFFF)
    Delete arg0
    Return $00
End Function
