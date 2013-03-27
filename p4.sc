;;;Creating the initial board

(define (list-of-n-zeroes n)
 (cond ((zero? n) (list))
       (else (cons 0 (list-of-n-zeroes (- n 1))))))

(define (list-of-n n listOutput)
 (cond ((eq? (length listOutput) n) listOutput)
       (else (list-of-n n (cons n listOutput)))))

(define (initial-board n)
 (map list-of-n-zeroes (list-of-n n (list))))


;;;
       
