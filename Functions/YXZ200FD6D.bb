Function YXZ200FD6D%(arg0.TX2BF6X0FF4)
    Local local0%
    For local0 = $00 To $05 Step $01
        If (arg0\Field43[local0] <> Null) Then
            arg0\Field43[local0]\Field1 = $01
        EndIf
    Next
    Return $00
End Function
