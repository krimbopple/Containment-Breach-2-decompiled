Function YD4XDD828%()
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    If (T2XZF288FFX() = $01) Then
        If (TXD2B44D0F(local0) <> $00) Then
            local3 = TXX048ZX2XF(F2648FXXF\Field7)
            F0Z646402(local3, local1, local2)
            F2648FXXF\Field12\Field1 = local1
            F2648FXXF\Field12\Field0 = local2
            F2648FXXF\Field12\Field2 = $00
            Return $01
        EndIf
        Return $00
    EndIf
    If (T402D8DD66(F2648FXXF\Field13, F2648FXXF\Field7) <> 0) Then
        F2648FXXF\Field12\Field1 = XB0FFX0XD8(F2648FXXF\Field13)
        F2648FXXF\Field12\Field0 = D606X8D4B(F2648FXXF\Field13)
        If (TXZB6Z8228Z(F2648FXXF\Field13) <> 0) Then
            F2648FXXF\Field12\Field2 = $02
        ElseIf (TX0XXB20208(F2648FXXF\Field13) <> 0) Then
            F2648FXXF\Field12\Field2 = $01
        Else
            F2648FXXF\Field12\Field2 = $00
        EndIf
        F2648FXXF\Field2 = (F2648FXXF\Field2 + F2648FXXF\Field7\Field2)
        Return $01
    EndIf
    Return $00
    Return $00
End Function
