Function BDD4FF46X%(arg0%, arg1%)
    Local local0%
    Local local1%
    For local0 = $00 To (F2648FXXF\Field3 - $01) Step $01
        For local1 = $00 To (F2648FXXF\Field6 - $01) Step $01
            If (T82D02BF6X(local0, local1) <> $00) Then
                XB224D424F(T82D02BF6X(local0, local1))
                T82D02BF6X(local0, local1) = $00
            EndIf
        Next
    Next
    F2648FXXF\Field3 = arg0
    F2648FXXF\Field6 = arg1
    Dim T82D02BF6X%(F2648FXXF\Field3, F2648FXXF\Field6)
    For local0 = $00 To (F2648FXXF\Field3 - $01) Step $01
        For local1 = $00 To (F2648FXXF\Field6 - $01) Step $01
            T82D02BF6X(local0, local1) = T64846FFF2()
        Next
    Next
    Return $00
End Function
