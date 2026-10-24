Function TXXBZ06X4BX%()
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2%
    Local local3%
    Local local4.T24B4ZF6F6
    Local local5.items
    TXDFXDZXXDD\Field0 = (TXDFXDZXXDD\Field0 + fps\Field3[$00])
    If (8.0 <= TXDFXDZXXDD\Field0) Then
        local0 = TXXF6F02DB2[TXXDZB2ZBXX()]
        If (local0 = Null) Then
            Return $00
        EndIf
        For local1 = $00 To $05 Step $01
            TXDFXDZXXDD\Field16[local1] = $00
        Next
        TXDFXDZXXDD\Field2 = $00
        TXDFXDZXXDD\Field5 = $00
        If (T484F2XDF <> Null) Then
            For local1 = $00 To (maxitemamount - $01) Step $01
                If (((((TX60DB8XBBZ(local1) <> Null) And (TX60DB8XBBZ(local1)\Field31 = $07)) And (0.0 < TX60DB8XBBZ(local1)\Field15)) And (0.0 < TX60DB8XBBZ(local1)\Field3)) <> 0) Then
                    TXDFXDZXXDD\Field2 = (Int TX60DB8XBBZ(local1)\Field3)
                    TXDFXDZXXDD\Field5 = TX60DB8XBBZ(local1)\Field27
                    Exit
                EndIf
            Next
        EndIf
        local2 = E0B68ZZ2(local0, $06)
        If (local2 <> $00) Then
            local3 = T222X2BB2B(local2)
            local2 = $00
            If (local3 > $00) Then
                local4 = X4DZBDB0DZ(local3)
                If (local4\Field3\Field26 <> 0) Then
                    TX0Z8FFZ8Z0(local4, Null, $00)
                    local2 = $01
                EndIf
            EndIf
        EndIf
        local5 = TX8BXZD868F()
        If (local5 <> Null) Then
            local4 = X4DZBDB0DZ(local5\Field6\Field11)
            If (local4 <> Null) Then
                TXDFXDZXXDD\Field16[$05] = local5\Field27
            EndIf
        ElseIf (((local2 = $00) And (DZ64X028\Field3 = $00)) <> 0) Then
            TX0Z8FFZ8Z0(Null, Null, $00)
        EndIf
        If (i_427\Field2 <> 0) Then
            TXDFXDZXXDD\Field16[$03] = XXZDD4D62($12)
            If (TXDFXDZXXDD\Field16[$03] = $00) Then
                i_427\Field2 = $00
            EndIf
        EndIf
        If (i_714\Field0 > $00) Then
            TXDFXDZXXDD\Field16[$04] = XXZDD4D62(XZFD002ZXZ\Field0[(i_714\Field0 - $01)])
            If (TXDFXDZXXDD\Field16[$04] = $00) Then
                i_714\Field0 = $00
            EndIf
        EndIf
        If (T8660BZ460\Field10 > $00) Then
            TXDFXDZXXDD\Field16[$01] = XXZDD4D62(XZFD002ZXZ\Field1[(T8660BZ460\Field10 - $01)])
            If (TXDFXDZXXDD\Field16[$01] = $00) Then
                T8660BZ460\Field10 = $00
            EndIf
            If (TXDFXDZXXDD\Field16[$01] = local0\Field53) Then
                local0\Field53 = $00
            EndIf
            Return $00
        EndIf
        If (T8660BZ460\Field3 > $00) Then
            TXDFXDZXXDD\Field16[$00] = XXZDD4D62(XZFD002ZXZ\Field3[(T8660BZ460\Field3 - $01)])
            If (TXDFXDZXXDD\Field16[$00] = $00) Then
                T8660BZ460\Field3 = $00
            EndIf
        ElseIf (T8660BZ460\Field8 > $00) Then
            TXDFXDZXXDD\Field16[$00] = XXZDD4D62(XZFD002ZXZ\Field4[(T8660BZ460\Field8 - $01)])
            If (TXDFXDZXXDD\Field16[$00] = $00) Then
                T8660BZ460\Field8 = $00
            EndIf
        ElseIf (T8660BZ460\Field11 > $00) Then
            TXDFXDZXXDD\Field16[$00] = XXZDD4D62(XZFD002ZXZ\Field5[(T8660BZ460\Field11 - $01)])
            If (TXDFXDZXXDD\Field16[$00] = $00) Then
                T8660BZ460\Field11 = $00
            EndIf
        EndIf
        If (T8660BZ460\Field6 > $00) Then
            TXDFXDZXXDD\Field16[$01] = XXZDD4D62(XZFD002ZXZ\Field6[(T8660BZ460\Field6 - $01)])
            If (TXDFXDZXXDD\Field16[$01] = $00) Then
                T8660BZ460\Field6 = $00
            EndIf
        EndIf
        If (T8660BZ460\Field7 > $00) Then
            TXDFXDZXXDD\Field16[$02] = XXZDD4D62(XZFD002ZXZ\Field7[(T8660BZ460\Field7 - $01)])
            If (TXDFXDZXXDD\Field16[$02] = $00) Then
                T8660BZ460\Field7 = $00
            EndIf
        ElseIf (i_268\Field2 > $00) Then
            TXDFXDZXXDD\Field16[$02] = XXZDD4D62(XZFD002ZXZ\Field2[(i_268\Field2 - $01)])
            If (TXDFXDZXXDD\Field16[$02] = $00) Then
                i_268\Field2 = $00
            EndIf
        EndIf
        TXDFXDZXXDD\Field0 = 0.0
    EndIf
    Return $00
End Function
