Function TXZB6XZ0D68%()
    Local local0%
    If (TXXZZZ42Z68() = $00) Then
        Return $00
    EndIf
    If (DX68080D6() <> $00) Then
        If (TXB2BFFFFFX() <> 0) Then
            TXBXZB40F2Z(TXXF6F02DB2[TXXDZB2ZBXX()], 180.0, DX68080D6(), (TXDFXDZXXDD\Field2 * T484F2XDF\Field6))
        Else
            TXX0228B6D0(ZZ8068B0F(), XFFF4XB224(), TXXDZB2ZBXX(), DX68080D6(), T484F2XDF\Field6, $00)
        EndIf
    EndIf
    If (((((T484F2XDF\Field4 = $00) And (ZFF8X2F22 = $00)) And keyhit(key\Field17)) And (TXDFXDZXXDD\Field2 > $00)) <> 0) Then
        playsound_strict(snd_i\Field39, $00, $00)
    EndIf
    T484F2XDF\Field6 = $00
    If ((((T484F2XDF\Field4 = $00) And (ZFF8X2F22 = $00)) And ((keydown(key\Field9) Lor keydown(key\Field17)) Lor (opt\Field80 And (0.3 < TDXXZ0ZZZD(T484F2XDF\Field8))))) <> 0) Then
        T484F2XDF\Field3 = (T2FFB8B2F0() + $FA)
        T484F2XDF\Field6 = (keydown(key\Field17) And (TXDFXDZXXDD\Field2 > $00))
    EndIf
    local0 = (T484F2XDF\Field3 > T2FFB8B2F0())
    DBXX22B8Z(local0)
    Return $00
End Function
