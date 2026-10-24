Function FB0BDFX4B%(arg0.items, arg1%)
    Select arg0\Field6\Field9
        Case $2D
            setanimtime(arg0\Field5, ((Float (arg1 = $00)) * 17.0), $00)
        Case $2E
            setanimtime(arg0\Field5, (Float ($02 - arg1)), $00)
        Case $13
            setanimtime(arg0\Field5, ((Float arg1) * 6.0), $00)
    End Select
    If (arg1 <> 0) Then
        arg0\Field20 = arg0\Field6\Field14
    ElseIf (arg0\Field6\Field10 <> $00) Then
        arg0\Field20 = arg0\Field6\Field10
    EndIf
    Return $00
End Function
