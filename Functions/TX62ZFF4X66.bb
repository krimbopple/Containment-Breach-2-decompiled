Function TX62ZFF4X66%(arg0.TX2BF6X0FF4)
    If (arg0\Field55\Field7 <> $00) Then
        If ((arg0\Field12 Lor (arg0\Field4 = $00)) <> 0) Then
            If (entityhidden(arg0\Field55\Field7) = $00) Then
                hideentity(arg0\Field55\Field7)
            EndIf
        ElseIf (entityhidden(arg0\Field55\Field7) <> 0) Then
            showentity(arg0\Field55\Field7)
        EndIf
    EndIf
    Return $00
End Function
