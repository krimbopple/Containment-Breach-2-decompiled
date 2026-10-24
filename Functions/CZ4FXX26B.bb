Function CZ4FXX26B%()
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    If (T484F2XDF = Null) Then
        Return $00
    EndIf
    local0 = TXXBDFDXZDZ(T484F2XDF\Field8, T484F2XDF\Field0, $00)
    If (1.0 <= T442X82B6B(local0)) Then
        local1 = createbank((Int ((Float local0) * 1.25)))
        TXXBDFDXZDZ(T484F2XDF\Field8, local1, banksize(local1))
        freebank(local1)
        local1 = $00
    EndIf
    If (DD4DX84F() <> 0) Then
        resizebank(T484F2XDF\Field1, $00)
        If (TXXBDFDXZDZ(T484F2XDF\Field8, T484F2XDF\Field0, $00) >= banksize(T484F2XDF\Field0)) Then
            TXXBDFDXZDZ(T484F2XDF\Field8, T484F2XDF\Field0, banksize(T484F2XDF\Field0))
            local3 = T20Z2Z66DF2(T484F2XDF\Field0)
            If (local3 <> $00) Then
                X0X6D8BZ2F(local3, $00, T484F2XDF\Field1, banksize(local3))
                freebank(local3)
                local3 = $00
            EndIf
        EndIf
    EndIf
    TXZB6XZ0D68()
    Return $00
End Function
