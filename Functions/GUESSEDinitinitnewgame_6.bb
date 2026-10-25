Function GUESSEDinitinitnewgame_6%(arg0$)
    Local local0.XZD48028ZB
    If (arg0 = "") Then
        Return $FFFFFFFF
    EndIf
    For local0 = Each XZD48028ZB
        If (local0\Field1 = arg0) Then
            Return local0\Field5
        EndIf
    Next
    Return $FFFFFFFF
    Return $00
End Function
