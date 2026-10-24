Function XBX0Z06D4Z%(arg0.TX2BF6X0FF4, arg1#, arg2#, arg3#)
    Local local0#
    If (arg0\Field46 <> Null) Then
        local0 = Y0BB8BB88Z(arg0, arg1, arg2, arg3)
        If (arg0\Field13 = TXXDZB2ZBXX()) Then
            XZ0260X8X2\Field11 = (XZ0260X8X2\Field11 + local0)
        EndIf
        arg0\Field46\Field9 = (arg0\Field46\Field9 + local0)
        Return $00
    EndIf
    Return $00
End Function
