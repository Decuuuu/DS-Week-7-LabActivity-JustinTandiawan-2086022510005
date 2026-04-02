1. Why does a linked list need a head variable?
-Karena head adalah satu-satunya referensi atau "pintu masuk" menuju node pertama. Karena lokasi node di memori tidak berurutan (non-contiguous), tanpa head, program tidak akan tahu di mana daftar itu dimulai dan kita akan kehilangan akses ke seluruh data.

2.Why does each node store a next reference?
-Referensi next berfungsi sebagai rantai penghubung. Karena node tersebar di memori, satu node harus "memegang" alamat node berikutnya agar struktur data tetap tersambung.

3.Why is insertion at the beginning easier in linked list than in array?
-Karena pada saat kita menggunakan Array kita harus menggeser (shifting) semua elemen yang ada ke kanan untuk memberi ruang di indeks 0, sedangkan LinkedList, kita hanya perlu membuat node baru dan mengubah dua referensi (menghubungkan node baru ke head lama, lalu memindahkan head ke node baru). Tidak ada data yang perlu digeser.

4.In insertAtBeginning(), why do we write:
newNode.next = head;
head = newNode;
in that order?
-Jika kamu mengubah head = newNode terlebih dahulu, kamu akan kehilangan alamat ke sisa daftar yang lama (terputus). Dengan newNode.next = head, node baru "mengamankan" daftar yang sudah ada terlebih dahulu sebelum ia sendiri resmi menjadi kepala (head) yang baru.

5.In display(), what would happen if we accidentally wrote:
while (current.next != null)
instead of:
while (current != null)\
-while (current != null) memastikan setiap node, termasuk yang terakhir, diproses sebelum keluar dari loop, sehingga data terakhir pada linked list akan menghilang dari tampilan layar.

6.Which structure is better for fast random access?
-Array. Array memungkinkan kita langsung mengakses elemen di indeks manapun (misal: arr[500]) dalam waktu konstan karena lokasinya berurutan di memori. Di linked list, kita harus menelusuri dari head satu per satu.

7.Which structure is better for frequent insertion at the beginning?
-Linked List. Seperti penjelasan di nomor 3, linked list hanya mengubah referensi pointer, sedangkan array harus melakukan pergeseran data yang memakan waktu lama.

8.Why does linked list use more memory than array?
-Karena linked list memiliki overhead. Selain menyimpan data itu sendiri, setiap node harus menyimpan setidaknya satu informasi tambahan, yaitu referensi/pointer (next) ke node berikutnya. Pada array, memori hanya digunakan murni untuk menyimpan data.
