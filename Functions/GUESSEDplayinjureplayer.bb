Function GUESSEDplayinjureplayer%(arg0.TX2BF6X0FF4, arg1#, arg2#, arg3#)
    Local local0#
    If (arg0\Field46 <> Null) Then
        local0 = GUESSEDgetarg1_3(arg0, arg1, arg2, arg3)
        If (arg0\Field13 = GUESSEDupdatedropitem()) Then
            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + local0)
        EndIf
        arg0\Field46\Field9 = (arg0\Field46\Field9 + local0)
        Return $00
    EndIf
    Return $00
End Function
