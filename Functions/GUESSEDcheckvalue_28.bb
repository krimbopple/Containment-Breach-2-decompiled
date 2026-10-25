Function GUESSEDcheckvalue_28%(arg0.TX2BF6X0FF4)
    If (FD020X0BZ\Field4 > $00) Then
        If (arg0\Field46\Field24 = $00) Then
            arg0\Field46\Field24 = (GUESSEDupdateitems_2() + FD020X0BZ\Field4)
        EndIf
        arg0\Field46\Field12 = (arg0\Field46\Field12 - fps\Field3[$00])
        arg0\Field46\Field31 = $00
        arg0\Field46\Field9 = 0.0
        arg0\Field46\Field27 = 0.0
        arg0\Field46\Field19 = 0.0
        arg0\Field46\Field49 = 0.0
        arg0\Field46\Field33 = 210.0
        arg0\Field46\Field51 = 1.0
        arg0\Field46\Field40 = 0.0
        If (selecteddifficulty\Field1 = $03) Then
            Return $00
        EndIf
        If (arg0\Field46\Field24 < GUESSEDupdateitems_2()) Then
            GUESSEDfreeentity_12(arg0)
        EndIf
    EndIf
    Return $00
End Function
