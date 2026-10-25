Function GUESSEDsetfield_17%(arg0.TX2BF6X0FF4)
    If (((arg0\Field20 <> $04) And (arg0\Field20 <> $01)) <> 0) Then
        If (((arg0\Field20 >= $04) And (arg0\Field20 <= $05)) <> 0) Then
            arg0\Field20 = $04
        Else
            arg0\Field20 = $01
        EndIf
    EndIf
    Return $00
End Function
