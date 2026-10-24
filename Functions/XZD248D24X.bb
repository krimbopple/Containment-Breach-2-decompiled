Function XZD248D24X%(arg0.items)
    Local local0.T24B4ZF6F6
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (arg0\Field6\Field11 > $00) Then
        local0 = X4DZBDB0DZ(arg0\Field6\Field11)
        If ((((Float local0\Field3\Field52) > arg0\Field15) And (0.0 < arg0\Field3)) <> 0) Then
            arg0\Field3 = (arg0\Field3 - ((Float local0\Field3\Field52) - arg0\Field15))
            arg0\Field15 = ((Float local0\Field3\Field52) + min(arg0\Field3, 0.0))
            arg0\Field3 = max(arg0\Field3, 0.0)
            arg0\Field26 = 70.0
        EndIf
    EndIf
    Return $00
End Function
