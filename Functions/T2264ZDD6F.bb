Function T2264ZDD6F%(arg0.T20BFZFZ62X)
    Local local0%
    If (arg0 = Null) Then
        Return $00
    EndIf
    For local0 = $00 To $09 Step $01
        If (arg0\Field12[local0] <> Null) Then
            positionentity(arg0\Field12[local0]\Field9, entityx(arg0\Field4, $01, 1.0), (entityy(arg0\Field4, $01, 1.0) + 0.1), entityz(arg0\Field4, $01, 1.0), $01)
            resetentity(arg0\Field12[local0]\Field9)
            arg0\Field12[local0]\Field17 = $00
        EndIf
    Next
    TX0DFFXFDD8($03, arg0\Field2, arg0, $FFFFFFFF)
    freeentity(arg0\Field19)
    Delete arg0
    Return $00
End Function
